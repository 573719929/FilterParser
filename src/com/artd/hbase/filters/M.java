package com.artd.hbase.filters;

public class M {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
			new AND(		
				new OR(
					new AND( new GTE("CF", "start", "180000"), new LTE("CF", "start", "203000") ),
					new AND( new GTE("CF", "end", "180000"), new LTE("CF", "end", "203000") )
				),
				new IN("CF", "area", new String[]{"1", "104", "77", "39"}),
				new IN("CF", "channel", new String[]{"2", "3", "6"}),
				new AND(
					new GTE("CF", "date", "20130918"), new LTE("CF", "date", "20130930")
				),
				new EQ("CF", "type", "µÁ ”æÁ")
			).get()
		);
	}

}
