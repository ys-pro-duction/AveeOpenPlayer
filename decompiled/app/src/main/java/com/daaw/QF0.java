package com.daaw;

import com.daaw.YF0;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class QF0 extends SF0 implements V20 {
    public final Field a;

    public QF0(Field field) {
        G10.g(field, "member");
        this.a = field;
    }

    @Override // com.daaw.V20
    public boolean G() {
        return S().isEnumConstant();
    }

    @Override // com.daaw.V20
    public boolean P() {
        return false;
    }

    @Override // com.daaw.SF0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public Field S() {
        return this.a;
    }

    @Override // com.daaw.V20
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public YF0 getType() {
        YF0.a aVar = YF0.a;
        Type genericType = S().getGenericType();
        G10.f(genericType, "getGenericType(...)");
        return aVar.a(genericType);
    }
}
