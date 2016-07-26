package wbs.basic_data_types;

/*
* kann der folgende quelltext compiliert und ausgeführt werden? falls ja:
* gibt es bei der ausführung eine exception? falls ja: welche exception?
*/
public class C07 {
	public static void main(String[] args) {
		String s1 = "abc";
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		@SuppressWarnings("unused")
		CharSequence cs = (CharSequence) (Object) s1;
		cs = (CharSequence) (Object) sb1;
		cs = (CharSequence) (Object) sb2;
	//	cs = (Object) (Integer) (Object) sb1;
	}
}