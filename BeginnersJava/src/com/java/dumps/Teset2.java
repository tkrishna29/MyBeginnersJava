package com.java.dumps;

public class Teset2 { 

	public static void main (String[] args) { 
String [][] chg = new String[2][ ];

chg [0] = new String [2] ; 
chg [ 1 ] = new String [5] ; 
 
int i = 97; 
for (int a=0;a<chg.length; a++) { 
for (int b=0;b<chg.length; b++) {
chg[a][b] = "" + i;
i++;
}}

for (String[] ca:chg) {
	for (String c:ca) {
		System.out.println(c+ " ");
	}
}

}
}