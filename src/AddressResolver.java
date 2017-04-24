
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Carlesso
 */
public class AddressResolver {
    
    public static Address resolveAddress(String fullAddress) {
        Address resolved = new Address();
        
        // removing coma
        fullAddress = fullAddress.replace(",", "");
        
        // simple cases
        if(addressStartWithNumber(fullAddress)){
            Matcher matcher = Pattern.compile("([^\\\\a-zA-Záéíóúä]+)(.*)").matcher(fullAddress);
            if (matcher.matches()) {
                resolved.setNumber(matcher.group(1).trim());
                resolved.setStreet(matcher.group(2));
            }
        }
        
        else{
            String[] numberInAddress = getDigitsFromAddress(fullAddress);
            
            // complex cases
            if(numberInAddress.length>1){                
                String streetNumber = numberInAddress[0];
                int numberStartPos = fullAddress.indexOf(streetNumber)+streetNumber.length();
                
                String street = fullAddress.substring(0, numberStartPos);
                resolved.setStreet(street.trim());
                
                String number = fullAddress.substring(numberStartPos);
                resolved.setNumber(number.trim());
            }
            
            // international cases
            else{
                Matcher matcher = Pattern.compile("([^\\d]+)(.*)").matcher(fullAddress);

                if (matcher.matches()) {
                    resolved.setStreet(matcher.group(1).trim());
                    resolved.setNumber(matcher.group(2));
                }
            }
        }
        return resolved;
    }
    
    private static String[] getDigitsFromAddress(String fullAddress){
        return (fullAddress.replaceAll("[a-zA-Záéíóúä]","").trim().split(" "));
    }
    
    private static boolean addressStartWithNumber(String add){
        return Character.isDigit(add.charAt(0));
    }
}
