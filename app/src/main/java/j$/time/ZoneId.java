package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {
    public static final Map a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f K();

    public abstract void O(ObjectOutput objectOutput);

    public abstract String m();

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.P("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.P("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.P("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.P("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.P("AST", "America/Anchorage"), j$.com.android.tools.r8.a.P("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.P("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.P("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.P("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.P("CST", "America/Chicago"), j$.com.android.tools.r8.a.P("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.P("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.P("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.P("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.P("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.P("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.P("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.P("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.P("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.P("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.P("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.P("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.P("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.P("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.P("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.P("EST", "-05:00"), j$.com.android.tools.r8.a.P("MST", "-07:00"), j$.com.android.tools.r8.a.P("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        a = Collections.unmodifiableMap(map);
    }

    public static ZoneId M(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.b != 0) {
            str = str.concat(zoneOffset.c);
        }
        return new t(str, zoneOffset.K());
    }

    public static ZoneId L(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.P(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return N(str, 3, z);
        }
        if (str.startsWith("UT")) {
            return N(str, 2, z);
        }
        return t.P(str, z);
    }

    public static ZoneId N(String str, int i, boolean z) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return M(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return t.P(str, z);
        }
        try {
            ZoneOffset zoneOffsetP = ZoneOffset.P(str.substring(i));
            if (zoneOffsetP == ZoneOffset.UTC) {
                return M(strSubstring, zoneOffsetP);
            }
            return M(strSubstring, zoneOffsetP);
        } catch (b e) {
            throw new b("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != t.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return m().equals(((ZoneId) obj).m());
        }
        return false;
    }

    public int hashCode() {
        return m().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return m();
    }

    private Object writeReplace() {
        return new o((byte) 7, this);
    }
}
