package com.artd.hbase.filters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.FilterList;


public class AND extends FBase {
	private FBase[] f;
	public AND(FBase ...fbl) {
		List<FBase> l = Arrays.asList(fbl);
		this.f = new FBase[l.size()];
		for(int i = 0; i < this.f.length; i++) {
			this.f[i] = l.get(i);
		}
	}
	@Override
	public Filter get() {
		ArrayList<Filter> fl = new ArrayList<Filter>();
		for(int i = 0; i < this.f.length; i++) {
			fl.add(this.f[i].get());
		}
		return new FilterList(FilterList.Operator.MUST_PASS_ALL, fl);
	}

}
