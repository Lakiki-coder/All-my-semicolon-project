const Person = {
  name: "John Doe",
  age: 30,
  gender: "Male",
  city: "New York"
};

for (let picker in Person) {
  console.log(picker + ": " + Person[picker]);
}