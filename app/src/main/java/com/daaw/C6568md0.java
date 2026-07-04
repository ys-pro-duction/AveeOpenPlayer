package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.md0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6568md0 {
    public static final C6568md0 a = new C6568md0();

    public final Object a(C4884gd0 c4884gd0) {
        G10.g(c4884gd0, "localeList");
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(c4884gd0, 10));
        Iterator<E> it = c4884gd0.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC4605fd0.a((C4316ed0) it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Locale[] localeArr = (Locale[]) array;
        return AbstractC6289ld0.a(AbstractC6001kd0.a((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(C8101s6 c8101s6, C4884gd0 c4884gd0) {
        G10.g(c8101s6, "textPaint");
        G10.g(c4884gd0, "localeList");
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(c4884gd0, 10));
        Iterator<E> it = c4884gd0.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC4605fd0.a((C4316ed0) it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Locale[] localeArr = (Locale[]) array;
        c8101s6.setTextLocales(AbstractC6001kd0.a((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
