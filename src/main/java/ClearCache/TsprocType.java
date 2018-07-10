package ClearCache;

public enum TsprocType {

    LDAP_LOGIN_TL_REBUILD("ldap_tl"),

    LDAP_LOGIN_ZONE_REBUILD("ldap_zone");

    private final String claim;


    TsprocType(String claim) {
        this.claim = claim;
    }

    public String getClaim() {
        return claim;
    }
}
