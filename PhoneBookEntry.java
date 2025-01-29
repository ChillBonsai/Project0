public class PhoneBookEntry {

   private String name;

   private String phoneNumber;

   PhoneBookEntry(String n, String pn)
   {
       name = n;
       this.phoneNumber = pn;
   }

   public void setName(String n)
   {
       name = n;
   }

   public void setPhoneNumber(String pn)
   {
       phoneNumber = pn;
   }

   public String getName()
   {
       return name;
   }

   public String getPhoneNumber()
   {
       return phoneNumber;
   }



}
