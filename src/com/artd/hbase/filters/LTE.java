package com.artd.hbase.filters;
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.SingleColumnValueFilter;
import org.apache.hadoop.hbase.util.Bytes;


public class LTE extends FBase {
	private SingleColumnValueFilter filter;
	public LTE(String ColumnFamily, String Qualifier, String value) {
		this.filter=new SingleColumnValueFilter(Bytes.toBytes(ColumnFamily), Bytes.toBytes(Qualifier), CompareOp.LESS_OR_EQUAL, Bytes.toBytes(value.toString()));
	}
	public Filter get() {
		return this.filter;
	}
}
