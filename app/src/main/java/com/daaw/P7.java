package com.daaw;

import com.daaw.O7;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class P7 implements O7 {
    public final I80 a;
    public final Map b;
    public final RU0 c;

    public P7(I80 i80, Map map, RU0 ru0) {
        if (i80 == null) {
            a(0);
        }
        if (map == null) {
            a(1);
        }
        if (ru0 == null) {
            a(2);
        }
        this.a = i80;
        this.b = map;
        this.c = ru0;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // com.daaw.O7
    public AP d() {
        return O7.a.a(this);
    }

    @Override // com.daaw.O7
    public I80 getType() {
        I80 i80 = this.a;
        if (i80 == null) {
            a(3);
        }
        return i80;
    }

    @Override // com.daaw.O7
    public RU0 j() {
        RU0 ru0 = this.c;
        if (ru0 == null) {
            a(5);
        }
        return ru0;
    }

    @Override // com.daaw.O7
    public Map k() {
        Map map = this.b;
        if (map == null) {
            a(4);
        }
        return map;
    }

    public String toString() {
        return AbstractC2923Yz.h.P(this, null);
    }
}
