class Person:

    def __init__(self,n,a):
        self.name = n
        self.age = a

    def __add__(self, other):
        n = self.name + other.name
        a = self.age + other.age
        p = Person(n,a)
        return p

    def __gt__(self, other):
        print('in gt() ' + str(self.age) + ' ' + str(other.age))
        return True if self.age > other.age else False

    def __lt__(self, other):
        print('in lt() '+str(self.age) + ' '+str(other.age))
        return True if self.age < other.age else False

    def __str__(self):
        return 'Name:'+str(self.name)+', Age:'+str(self.age)

    def __eq__(self, other): #override
        print('in eq() of Person')
        if isinstance(other,Person):
            if self.name == other.name and self.age == other.age:
                return True
            else:
                return False
        else:
            return False

s1 = '!%ˆˆbcd!'
s2 = '!%ˆˆbc' + 'd!'
p1 = Person('Batman',40)
p2 = Person('Batman',40)
p3 = Person('Superman',50)

print(id(p1))
print(id(p2))
print(str(p1))
print(p2)
print(p1 == p2)
print(p1==s1)
print(p1==p3)
print(p1!=p2)
print(p1!=p3)
print(p1+p2+p3)
print(p1<p3)
print(p3>p1)
print(p1>p2)