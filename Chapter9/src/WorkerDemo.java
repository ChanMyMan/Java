public class WorkerDemo
{
      public static void main (String[] args)
      {
            ProductionWorker pw =
                     new ProductionWorker("Chandler Wolters", "123-A", "11-15-2015",
                                                        ProductionWorker.DAY_SHIFT, 6.50);
      System.out.println("Employee. ");
      System.out.println(pw);
      ProductionWorker pw2 = new ProductionWorker();
      pw2.setName("John Doe");
      pw2.setEmployeeNumber("122-B");
      pw2.setHireDate("12-12-2010");
      pw2.setShift(ProductionWorker.NIGHT_SHIFT);
      pw2.setPayRate(8.50);
      System.out.println("\nProduction worker. ");
      System.out.println(pw2);
      
      ShiftSupervisor ss = new ShiftSupervisor();
      ss.setName("Joe Bob");
      ss.setEmployeeNumber("122-D");
      ss.setHireDate("11/11/14");
      ss.setSalary(200000);
      ss.setAnnualBonus(6000);
      System.out.println("\nShiftSupervisor. ");
     System.out.println(ss);
     
     TeamLeader tl = new TeamLeader();
    tl.setName("Billy Moe");
     tl.setEmployeeNumber("192-D");
     tl.setHireDate("11/02/14");
     tl.setMonthlyBonus(900);
     tl.setSalary(900000);
     tl.setTrainingHours("33 hours");
     System.out.println("\nTeamLeader. ");
    System.out.println(tl);
     
   }
}