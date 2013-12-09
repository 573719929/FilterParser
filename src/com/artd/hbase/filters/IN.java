package com.artd.hbase.filters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.FilterList;


public class IN extends FBase {
	private FBase[] f;
	public IN(String ColumnFamily, String Qualifier, String values[]) {
		this.f = new FBase[values.length];
		for(int i = 0; i < this.f.length; i++) {
			this.f[i] = new EQ(ColumnFamily, Qualifier, values[i]);
		}
	}
	@Override
	public Filter get() {
		ArrayList<Filter> fl = new ArrayList<Filter>();
		for(int i = 0; i < this.f.length; i++) {
			fl.add(this.f[i].get());
		}
		return new FilterList(FilterList.Operator.MUST_PASS_ONE, fl);
	}
}
