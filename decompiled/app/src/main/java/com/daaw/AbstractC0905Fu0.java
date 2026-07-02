package com.daaw;

import android.text.Spannable;
import com.daaw.D7;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Fu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0905Fu0 {
    public static final void a(Spannable spannable, AbstractC0801Eu0 abstractC0801Eu0, int i, int i2, InterfaceC4988gz interfaceC4988gz) {
        throw null;
    }

    public static final void b(Spannable spannable, List list, InterfaceC4988gz interfaceC4988gz) {
        G10.g(spannable, "<this>");
        G10.g(list, "placeholders");
        G10.g(interfaceC4988gz, "density");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            D7.b bVar = (D7.b) list.get(i);
            AbstractC6314li0.a(bVar.a());
            a(spannable, null, bVar.b(), bVar.c(), interfaceC4988gz);
        }
    }
}
