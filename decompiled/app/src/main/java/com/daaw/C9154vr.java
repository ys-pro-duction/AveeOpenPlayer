package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import com.daaw.NU0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.vr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9154vr extends C2267Sr {

    /* JADX INFO: renamed from: com.daaw.vr$a */
    public static class a implements FQ {
        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2138Rl0 a(AbstractC9991yr abstractC9991yr) {
            return C2138Rl0.w(C9154vr.h0(com.daaw.avee.a.i(), abstractC9991yr.I(), abstractC9991yr.J()), null);
        }

        public a() {
        }
    }

    public C9154vr(Context context, String str, String str2, int i, int i2) {
        super(context, new a(), str, str2, i, i2, false);
    }

    public static List h0(Context context, int i, InterfaceC5694jX interfaceC5694jX) {
        if (context == null) {
            return new ArrayList();
        }
        Cursor cursorE = AbstractC2022Qi0.e(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, null, null, AbstractC2022Qi0.c((NU0.h) AbstractC9991yr.s.a(Integer.valueOf(i), interfaceC5694jX, null), 0));
        ArrayList arrayList = new ArrayList();
        if (cursorE != null) {
            AbstractC1454Lb1.f(cursorE, arrayList);
        }
        return arrayList;
    }
}
