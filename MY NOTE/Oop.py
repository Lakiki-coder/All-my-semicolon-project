class Student:
	def __init__(self, name, age=23):
		self.name = name
		self.age = none
		self.contacts = []
		self.set_age(age)

	def get_student_details(self):
		return f"Student name:{self.name}\nStudent Age:{self.age}"
    
student1 = Student("adam", 20)
student3 = Student("feyi", 5)
student2 = Student("eloka", 1)
student4 = Student("abdulrahman")
print(student1.get_student_details())

#keyword arguements, positional arguments, default argument

#setter are method used to update the value of a private attributes and to validate

#getter are method uxed to retrieve attributes value within a class   


#why setters and getters:

#. it gives encapsulation: keeping attributes private and controlling how they're accessed/modified
#. allow validation before setting values(e.g making sure age isn't negative)
#. flexibility: internal logic can change without affecting external code
#. they support read-only fields when needed

#. naturally, nothing is private in python
#. getters returns only

#it's display:
	def get_age(self):
		return self.age


#setter's display:
	def set_age(self, value):
		if value < 0:
			raise ValueError("age must be > 0")
		self.age = value

#instance attributes belong to the class
#instance method is working/manipulating with instance att.
#everything in the class should be accessed with self

#directory is for storing 
#venv is virtual environment


#testing code work:

class TesStudent(unittest.TestCase):

	def test_that_student_class_can_be_instantiated_with_valid_details(self):
		def setUp(self):
			self.s1 = Student(name:"Adam", age:20)

	def test_that_class_can_be_instantiated_with_valid_details(self):
		self.assertEqual(self.s1.getName(), second:"Adam")
		self.assertEqual(self.s1.getAge(), second:20)

	def test_that_class_can_not_be_instantiated_with_invalid_details(self):
		self.assertRaises(ValueError, self.s1.setAge(), -2)

	def test_that_student_contacts_is_empty(self):
		self.assertEqual(self.s1.contacts, second: [])

#instance att. are variables that belong to a specific object(instance) of a class in o.o.p
#they are mostly defined in the __init__ of the class and bind to the class using the first args in the class self
#examples are:
#car brand, color,human name, gender , age, account name, balance
#instance att. store data unique to each object created from a class

instance method are functions that are defined inside a class and use to operate instance of that class
Every instance is an object but not all objects are instances

advantage of instance method:

first parameter is self:
.every instance method takes the instnce itself(self)as the first paramter
.this allows the method to access and modify the instance's attributes

works on instance data:
.imnstance methods can read and update instance att.(data that belongs to a specific obj.)

called on objects, not classes:
you call an instance method using an object of the class, e.g obj.method()
an instance method is a function inside a class that works with the data of individual objects

class attributes........................









 