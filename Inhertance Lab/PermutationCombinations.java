/* 7) Try these permutations combinations by creating simple interfaces/classes.
a) Can an interface extend multiple interfaces?  -  yes.
b) Can a class implement multiple interfaces? - yes.
c) What happens when a class implements multiple interfaces with same method declaration?
d) Interface I1 has m1() and Interface I2 has m1() and m2(). m1() in I1 returns void and m1() in I2 returns int. Now create a class C1 that implements both I1 and I2. What methods will have to override? Does compilation succeed? Why?
e) Abstract class A1 implements I2 and overrides m1(). Now class C2 extends A1.Is it necessary to override any methods in C2? Put SOPs in all methods.*/
package InterfaceLab;
public interface PermutationCombinations
{
	public abstract void m1();
}
interface AAA
{
	public abstract void m1();
	public abstract void m2();
}
interface BBB
{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
}
interface CCC extends AAA,BBB
{
}
class DDD implements AAA,BBB,CCC
{
	public void m1()
	{
	}
	public void m2()
	{
	}
	public void m3()
	{
	}
}
