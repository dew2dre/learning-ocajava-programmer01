package week04practical;

class MethodsTest{
	public static void main(String...args){
		String str1 = "A BIG BROWN FOX JUMPS";
        String str2 = "OVER THE ";
         //I JUMP HE JUMPS
         
		String str3 = (str1 + " " + str2).trim();
		System.out.println(str3);
		
		
		
        int i1 = str3.indexOf("I");
        int i2 = str3.indexOf("JUMP");
        int i3 = str3.indexOf("HE");
        
        int l1 = "JUMP".length();
        int l2 = "HE".length();
        int l3 = l1 + 1;
        
		System.out.println(str3.charAt(i1)+ " "  +str3.substring(i2,i2+l1) + " "
		+ str3.substring(i3,i3+l2) + " " +  str3.substring(i2,i2+l3));
	}
}