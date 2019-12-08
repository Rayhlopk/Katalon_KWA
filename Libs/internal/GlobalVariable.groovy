package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object app
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_NotificationMessage
     
    /**
     * <p></p>
     */
    public static Object G_AndroidApp
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p></p>
     */
    public static Object mnemonic_dragon
     
    /**
     * <p></p>
     */
    public static Object address_stone
     
    /**
     * <p></p>
     */
    public static Object privkey_stone
     
    /**
     * <p></p>
     */
    public static Object xpub_dragon
     
    /**
     * <p></p>
     */
    public static Object xprv_dragon
     
    /**
     * <p></p>
     */
    public static Object omix_address
     
    /**
     * <p></p>
     */
    public static Object address_dragon
     
    /**
     * <p></p>
     */
    public static Object passphrase_advanced
     
    /**
     * <p></p>
     */
    public static Object dp_advanced
     
    /**
     * <p></p>
     */
    public static Object name_pk
     
    /**
     * <p></p>
     */
    public static Object name_mnem
     
    /**
     * <p></p>
     */
    public static Object name_XPRV
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            app = selectedVariables['app']
            G_Timeout = selectedVariables['G_Timeout']
            G_NotificationMessage = selectedVariables['G_NotificationMessage']
            G_AndroidApp = selectedVariables['G_AndroidApp']
            G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
            mnemonic_dragon = selectedVariables['mnemonic_dragon']
            address_stone = selectedVariables['address_stone']
            privkey_stone = selectedVariables['privkey_stone']
            xpub_dragon = selectedVariables['xpub_dragon']
            xprv_dragon = selectedVariables['xprv_dragon']
            omix_address = selectedVariables['omix_address']
            address_dragon = selectedVariables['address_dragon']
            passphrase_advanced = selectedVariables['passphrase_advanced']
            dp_advanced = selectedVariables['dp_advanced']
            name_pk = selectedVariables['name_pk']
            name_mnem = selectedVariables['name_mnem']
            name_XPRV = selectedVariables['name_XPRV']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
