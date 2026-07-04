package com.daaw;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.c83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3633c83 {
    public static final C3633c83 c = new C3633c83(null, null, 100);
    public final EnumMap a;
    public final int b;

    public C3633c83(Boolean bool, Boolean bool2, int i) {
        EnumMap enumMap = new EnumMap(EnumC9512x73.class);
        this.a = enumMap;
        enumMap.put(EnumC9512x73.AD_STORAGE, bool);
        enumMap.put(EnumC9512x73.ANALYTICS_STORAGE, bool2);
        this.b = i;
    }

    public static C3633c83 b(Bundle bundle, int i) {
        if (bundle == null) {
            return new C3633c83(null, null, i);
        }
        EnumMap enumMap = new EnumMap(EnumC9512x73.class);
        for (EnumC9512x73 enumC9512x73 : EnumC9512x73.values()) {
            enumMap.put(enumC9512x73, p(bundle.getString(enumC9512x73.B)));
        }
        return new C3633c83(enumMap, i);
    }

    public static C3633c83 c(String str, int i) {
        EnumMap enumMap = new EnumMap(EnumC9512x73.class);
        if (str != null) {
            int i2 = 0;
            while (true) {
                EnumC9512x73[] enumC9512x73Arr = EnumC9512x73.E;
                int length = enumC9512x73Arr.length;
                if (i2 >= 2) {
                    break;
                }
                EnumC9512x73 enumC9512x73 = enumC9512x73Arr[i2];
                int i3 = i2 + 2;
                if (i3 < str.length()) {
                    char cCharAt = str.charAt(i3);
                    Boolean bool = null;
                    if (cCharAt != '-') {
                        if (cCharAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (cCharAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(enumC9512x73, bool);
                }
                i2++;
            }
        }
        return new C3633c83(enumMap, i);
    }

    public static String h(Bundle bundle) {
        String string;
        for (EnumC9512x73 enumC9512x73 : EnumC9512x73.values()) {
            if (bundle.containsKey(enumC9512x73.B) && (string = bundle.getString(enumC9512x73.B)) != null && p(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean k(int i, int i2) {
        return i <= i2;
    }

    public static final int o(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static Boolean p(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final int a() {
        return this.b;
    }

    public final C3633c83 d(C3633c83 c3633c83) {
        EnumMap enumMap = new EnumMap(EnumC9512x73.class);
        for (EnumC9512x73 enumC9512x73 : EnumC9512x73.values()) {
            Boolean boolValueOf = (Boolean) this.a.get(enumC9512x73);
            Boolean bool = (Boolean) c3633c83.a.get(enumC9512x73);
            if (boolValueOf == null) {
                boolValueOf = bool;
            } else if (bool != null) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() && bool.booleanValue());
            }
            enumMap.put(enumC9512x73, boolValueOf);
        }
        return new C3633c83(enumMap, 100);
    }

    public final C3633c83 e(C3633c83 c3633c83) {
        EnumMap enumMap = new EnumMap(EnumC9512x73.class);
        for (EnumC9512x73 enumC9512x73 : EnumC9512x73.values()) {
            Boolean bool = (Boolean) this.a.get(enumC9512x73);
            if (bool == null) {
                bool = (Boolean) c3633c83.a.get(enumC9512x73);
            }
            enumMap.put(enumC9512x73, bool);
        }
        return new C3633c83(enumMap, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3633c83)) {
            return false;
        }
        C3633c83 c3633c83 = (C3633c83) obj;
        for (EnumC9512x73 enumC9512x73 : EnumC9512x73.values()) {
            if (o((Boolean) this.a.get(enumC9512x73)) != o((Boolean) c3633c83.a.get(enumC9512x73))) {
                return false;
            }
        }
        return this.b == c3633c83.b;
    }

    public final Boolean f() {
        return (Boolean) this.a.get(EnumC9512x73.AD_STORAGE);
    }

    public final Boolean g() {
        return (Boolean) this.a.get(EnumC9512x73.ANALYTICS_STORAGE);
    }

    public final int hashCode() {
        int iO = this.b * 17;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            iO = (iO * 31) + o((Boolean) it.next());
        }
        return iO;
    }

    public final String i() {
        StringBuilder sb = new StringBuilder("G1");
        EnumC9512x73[] enumC9512x73Arr = EnumC9512x73.E;
        int length = enumC9512x73Arr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.a.get(enumC9512x73Arr[i]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean j(EnumC9512x73 enumC9512x73) {
        Boolean bool = (Boolean) this.a.get(enumC9512x73);
        return bool == null || bool.booleanValue();
    }

    public final boolean l() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(C3633c83 c3633c83) {
        return n(c3633c83, (EnumC9512x73[]) this.a.keySet().toArray(new EnumC9512x73[0]));
    }

    public final boolean n(C3633c83 c3633c83, EnumC9512x73... enumC9512x73Arr) {
        for (EnumC9512x73 enumC9512x73 : enumC9512x73Arr) {
            Boolean bool = (Boolean) this.a.get(enumC9512x73);
            Boolean bool2 = (Boolean) c3633c83.a.get(enumC9512x73);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: source=");
        sb.append(this.b);
        for (EnumC9512x73 enumC9512x73 : EnumC9512x73.values()) {
            sb.append(", ");
            sb.append(enumC9512x73.name());
            sb.append("=");
            Boolean bool = (Boolean) this.a.get(enumC9512x73);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                sb.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb.toString();
    }

    public C3633c83(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(EnumC9512x73.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
