class Man:

    def __init__(self,n,a):
        self.name = n
        self.age = a

    def __eq__(self, other):
        if isinstance(other, Man) and self.name == other.name and self.age == other.age :
            return True
        else:
            return False

    def __hash__(self):
     # use the state, convert it into a string & invoke
     # hash() on it to return a number
        return hash(self.name+str(self.age))

m1 = Man('Ram',30)
m2 = Man('Ram',30)
print(m1==m2)
print(hash(m1))
print(hash(m2))
men = set()
men.add(m1)
men.add(m2)
print(len(men))