package wrappers;

class CheckImmutable {
	public static void main(String... args) {
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println("Operator wise equals: "+(i1==i2)+"not equals"+(i1!=i2));
		i1 = 128;
		i2 = 128;
		System.out.println(i1+" "+i2+" Operator wise equals: "+(i1==i2)+"not equals"+(i1!=i2));
		i1 = 1000;
		i2 = i1;
		System.out.println(i1+" "+i2+" Operator wise equals: "+(i1==i2)+"not equals"+(i1!=i2));
		i1++;
			
		System.out.println(i1+" "+i2+" Operator wise equals: "+(i1==i2)+"not equals"+(i1!=i2));
		i1 = 1000;
		i2 = new Integer(1000);
		System.out.println(i1+" "+i2+" Operator wise equals: "+(i1==i2)+"not equals"+(i1!=i2));
		i1 = 127;
		i2 = new Integer(127);
		System.out.println(i1+" "+i2+" Operator wise equals: "+(i1==i2)+"not equals"+(i1!=i2));

	}
}
