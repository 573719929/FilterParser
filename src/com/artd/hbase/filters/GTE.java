package com.artd.hbase.filters;
import java.util.Arrays;
import java.util.List;

import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.FilterBase;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
import org.apache.hadoop.hbase.util.Bytes;


public class GTE extends FBase {
	private SingleColumnValueFilter filter;
	public GTE(String ColumnFamily, String Qualifier, String value) {
		this.filter=new SingleColumnValueFilter(Bytes.toBytes(ColumnFamily), Bytes.toBytes(Qualifier), CompareOp.GREATER_OR_EQUAL, Bytes.toBytes(value.toString()));
	}
	public Filter get() {
		return this.filter;
	}
}
