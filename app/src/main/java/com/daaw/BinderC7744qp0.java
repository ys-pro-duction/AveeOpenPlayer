package com.daaw;

import android.os.IBinder;
import com.daaw.InterfaceC7934rX;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.daaw.qp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC7744qp0 extends InterfaceC7934rX.a {
    public final Object B;

    public BinderC7744qp0(Object obj) {
        this.B = obj;
    }

    public static Object I(InterfaceC7934rX interfaceC7934rX) {
        if (interfaceC7934rX instanceof BinderC7744qp0) {
            return ((BinderC7744qp0) interfaceC7934rX).B;
        }
        IBinder iBinderAsBinder = interfaceC7934rX.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        AbstractC7506py0.l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public static InterfaceC7934rX Z2(Object obj) {
        return new BinderC7744qp0(obj);
    }
}
