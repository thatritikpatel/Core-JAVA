class A{
	A(){
		System.out.println("A()");
	}
}

class B extends A{
	/*
	B(){
		System.out.println("B()");
	}*/
}

class C extends B{
	C(){
		System.out.println("C()");	
	}
}

class J{
	public static void main(String[] args){
		C x = new C();
	}
}