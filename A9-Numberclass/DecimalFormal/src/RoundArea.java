import java.text.*;

public class RoundArea {
	static public void SimpleFormat(String pattern, double value) {	//Ê¹ÓÃÊµÀý»¯¶ÔÏóÊ±ÉèÖÃžñÊœ»¯Ä£Êœ
		DecimalFormat myFormat = new DecimalFormat(pattern);	//ÊµÀý»¯DecimalFormat¶ÔÏó
		String output = myFormat.format(value);				//œ«Êý×ÖœøÐÐžñÊœ»¯
		System.out.println(value + " " + pattern + " " + output);
	} 
	public static double GetRoundArea(double r){
		return Math.PI*Math.pow(r, 2);
	}
	public static void main(String[] args) {
		System.out.print("Ô²µÄÃæ»ýÎª£º");
		SimpleFormat("#.#####",GetRoundArea(2));
	}

}