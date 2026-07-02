package com.daaw;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.y40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9773y40 {
    public final EnumC5076hI0 a;
    public final EnumC5076hI0 b;
    public final Map c;
    public final O90 d;
    public final boolean e;

    public C9773y40(EnumC5076hI0 enumC5076hI0, EnumC5076hI0 enumC5076hI02, Map map) {
        G10.g(enumC5076hI0, "globalLevel");
        G10.g(map, "userDefinedLevelForSpecificAnnotation");
        this.a = enumC5076hI0;
        this.b = enumC5076hI02;
        this.c = map;
        this.d = AbstractC3192ab0.a(new C9494x40(this));
        EnumC5076hI0 enumC5076hI03 = EnumC5076hI0.D;
        this.e = enumC5076hI0 == enumC5076hI03 && enumC5076hI02 == enumC5076hI03 && map.isEmpty();
    }

    public static final String[] b(C9773y40 c9773y40) {
        G10.g(c9773y40, "this$0");
        List listC = AbstractC1496Lm.c();
        listC.add(c9773y40.a.c());
        EnumC5076hI0 enumC5076hI0 = c9773y40.b;
        if (enumC5076hI0 != null) {
            listC.add("under-migration:" + enumC5076hI0.c());
        }
        for (Map.Entry entry : c9773y40.c.entrySet()) {
            listC.add('@' + entry.getKey() + ':' + ((EnumC5076hI0) entry.getValue()).c());
        }
        return (String[]) AbstractC1496Lm.a(listC).toArray(new String[0]);
    }

    public final EnumC5076hI0 c() {
        return this.a;
    }

    public final EnumC5076hI0 d() {
        return this.b;
    }

    public final Map e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9773y40)) {
            return false;
        }
        C9773y40 c9773y40 = (C9773y40) obj;
        return this.a == c9773y40.a && this.b == c9773y40.b && G10.c(this.c, c9773y40.c);
    }

    public final boolean f() {
        return this.e;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        EnumC5076hI0 enumC5076hI0 = this.b;
        return ((iHashCode + (enumC5076hI0 == null ? 0 : enumC5076hI0.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }

    public /* synthetic */ C9773y40(EnumC5076hI0 enumC5076hI0, EnumC5076hI0 enumC5076hI02, Map map, int i, AbstractC2911Yw abstractC2911Yw) {
        this(enumC5076hI0, (i & 2) != 0 ? null : enumC5076hI02, (i & 4) != 0 ? AbstractC1473Lg0.h() : map);
    }
}
