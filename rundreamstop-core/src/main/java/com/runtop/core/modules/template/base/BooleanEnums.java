package com.runtop.core.modules.template.base;

/**
 * @author 张自豪:zzh431@taohuichang.com
 * @date 2016/8/25
 */
public enum BooleanEnums implements BaseEnum<BooleanEnums, String> {

    /**
     * 是.
     */
    T("T", "是", Boolean.TRUE),

    /**
     * 否.
     */
    F("F", "否", Boolean.FALSE),;

    private final String value;
    private final String displayName;
    private final Boolean bool;
    private static java.util.Map<String, BooleanEnums> valueMap = new java.util.HashMap<String, BooleanEnums>();

    static {
        for (BooleanEnums e : BooleanEnums.values()) {
            valueMap.put(e.value, e);
        }
    }

    BooleanEnums(String value, String displayName, Boolean bool) {
        this.value = value;
        this.displayName = displayName;
        this.bool = bool;
    }

    @Override
    public BooleanEnums getEnum(String value) {
        return valueMap.get(value);
    }

    @Override
    public java.util.Map<String, BooleanEnums> getAllValueMap() {
        return valueMap;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    public Boolean getBool() {
        return bool;
    }

}
