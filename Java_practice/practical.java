class SY2022bit038 {
    public static void main(String[] args) {
       
        String[] registrationNumbers = {
            "2021bit001",
            "2022bcs002",
            "2023bme003",
            "2024bch004",
            "2023bee005",
            "2022bce006"
            
        };
	SY2022bit038 Database = new SY2022bit038();
        int Count = Database.getValidRegistrationsCount(registrationNumbers);
        System.out.println(Count);
    }

    public static int getValidRegistrationsCount(String[] registrationNumbers) {
        int validCount = 0;

        for (String regNumber : registrationNumbers) {
            if (isValidRegistrationNumber(regNumber)) {
                validCount++;
            }
        }

        return validCount;
    }

    private static boolean isValidRegistrationNumber(String regNumber) {
        
        String departmentCode = regNumber.substring(4, 7); 

        
        return departmentCode.equals("bit") || departmentCode.equals("bcs") ||
               departmentCode.equals("bme") || departmentCode.equals("bch");
    }
}
