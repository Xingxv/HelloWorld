/**
 * 字符串数组
 * @author LYW
 *
 */
public class StringArray {

	public static void main(String[] args) {
		String[] names = {"ABC", "XYZ", "zoo"};  //name[0] 指向 "ABC",  name[1] 指向 "XYZ",  name[2] 指向 "zoo"
        String s = names[1];  //s指向name[1]指向的"XYZ"
        names[1] = "cat";  //names[1] 指向 "cat"
        System.out.println(s); // s是"XYZ"还是"cat"?  s指向的是 "XYZ"
	}
}
