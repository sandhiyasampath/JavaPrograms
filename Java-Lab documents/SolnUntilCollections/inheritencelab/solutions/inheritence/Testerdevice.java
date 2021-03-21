/*) A device has a name and can do something. TV, Printer and Microwave are devices. Using
TV, you can watch movie; using Printer, you can print; using Microwave, you can cook (all these
are doSomething() implementations - so override them in the respective classes).When a
device is made to dosomething, it shouts out its name as well. An Electrician is one who can
test any device. When he is asked to test a device, he will make it do something and test it. A
TV can switchChannel as well (delta functionality). So if a tv is given to be tested to an
electrician, he will make the tv dosomething and switch channel as well. Write a tester class to
test how devices, electricians work.*/
package inheritence;

public class Testerdevice {

	public static void main(String[] args) {
		Device d=new Device();
		d.setName("davy");
		Tv t=new Tv();
		Microwave m=new Microwave();
		Printer p=new Printer();
		Electrician e=new Electrician();
		//Tv t1=(Tv)d;it will compile but gives classcastexception
	
		e.test(d);//picks the device implementation
		e.test(p);//picks the Printer implementation
		e.test(m);//picks the Microwave implementation
		e.test(t);//picks the Tv implementation
		Device d1=new Tv();//constructor chainig will happens
		d1.dosomething();//picks the tv implementation

	}

}
