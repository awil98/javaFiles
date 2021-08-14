public class E2P2{
  private E2P2Person[] people;
  private int size;

  public E2P2(){
    this.size = 1;
    this.people = new E2P2Person[1];
    E2P2Person p1 = new E2P2Person("John", "Smith");
    this.people[0] = p1;
  }

  /*He asks for a displayAll method that
    just displays all of the element in
    the array.
    */
  public void displayAll(){
    for(int i = 0; i < this.people.length; i++){
      ///I included this if statement because it displayed indexs that didn't store any objects
      if(people[i] == null){
        continue;
      }
      System.out.println(people[i]);
    }
  }
  /*EXAM Question:
    This method will update the size attribute. It will also make sure that,
    if we do not have room left in our array people,
    then you will create a new one that is twice the array’s current length,
    copy the elements from the old array into the new one, then update the attribute people.*/
  public void addPerson(E2P2Person obj){
      //So size will always be my index so if size == length then double the size else I can just incrememnt size
      if(size == this.people.length){
        E2P2Person[] temp = new E2P2Person[this.size * 2];//create a new array of twice the size if no space
        int sizeOfOldArray = this.people.length - 1;//this is the index of the last element

        for(int i = 0; i < this.people.length; i++){
          temp[i] = this.people[i];
        }//copy all of the elements into the new array

        this.people = temp;// assign the new array to the people attribute
        this.people[sizeOfOldArray] = obj;//this should now assign the new value to the correct spot
        this.size = sizeOfOldArray++;
      }else{
        this.people[size] = obj;
        this.size++;
      }

  }
  /*He basically says to create an addPerson method
    that takes in a firstName, lastName, and age,
    and then add this person to the array using the above method?*/
  public void addPerson(String firstName, String lastName, int age){
    E2P2Person newPerson = new E2P2Person(firstName, lastName);
    newPerson.setAge(age);
    addPerson(newPerson);
  }
}
