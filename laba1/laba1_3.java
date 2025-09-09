package laba1;

public class laba1_3 {
    public static void main(String[] args) {
        System.out.println("---Демонстрация автоупаковки и распаковки---");
        
        System.out.println("\nint и Integer: ");
        int primitiveInt = 42;
        Integer boxedInt = primitiveInt; 
        int unboxedInt = boxedInt;       
        
        System.out.println("primitiveInt: " + primitiveInt);
        System.out.println("boxedInt: " + boxedInt);
        System.out.println("unboxedInt: " + unboxedInt);
        System.out.println("Сравнение: " + (primitiveInt == boxedInt));
        
        System.out.println("\nboolean и Boolean:");
        boolean primitiveBool = true;
        Boolean boxedBool = primitiveBool; 
        boolean unboxedBool = boxedBool;   
        
        System.out.println("primitiveBool: " + primitiveBool);
        System.out.println("boxedBool: " + boxedBool);
        System.out.println("unboxedBool: " + unboxedBool);
        
        System.out.println("\nlong и Long:");
        long primitiveLong = 123456789L;
        Long boxedLong = primitiveLong;   
        long unboxedLong = boxedLong;     
        
        System.out.println("primitiveLong: " + primitiveLong);
        System.out.println("boxedLong: " + boxedLong);
        System.out.println("unboxedLong: " + unboxedLong);
        
        System.out.println("\n---Демонстрация ручной упаковки и распаковки---");
        
        Integer manualBoxedInt = Integer.valueOf(100);
        Boolean manualBoxedBool = Boolean.valueOf(false);
        Long manualBoxedLong = Long.valueOf(999999999L);
        
        int manualUnboxedIntValue = manualBoxedInt.intValue();
        boolean manualUnboxedBoolValue = manualBoxedBool.booleanValue();
        long manualUnboxedLongValue = manualBoxedLong.longValue();
   
        System.out.println("Ручная упаковка и распаковка работают корректно");
        
        System.out.println("\n---Ситуация с NullPointerException---");
        
        try {
          
            Integer nullIntegerObj = null; 
            System.out.println("nullInteger создан: " + nullIntegerObj);
           
            System.out.println("Попытка автораспаковки nullInteger...");
            int shouldFailValue = nullIntegerObj; 
            
            System.out.println("Это сообщение не будет выведено, так как должно возникнуть исключение");
            
        } catch (NullPointerException e) {
            System.out.println("Пойман NullPointerException: " + e.getMessage());
            System.out.println("Причина: попытка распаковать null Integer в примитивный int");
        }
    }
}
