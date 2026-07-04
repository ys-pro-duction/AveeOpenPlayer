package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.daaw.NU0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1308Jr extends C2267Sr {

    /* JADX INFO: renamed from: com.daaw.Jr$a */
    public static class a implements FQ {
        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2138Rl0 a(AbstractC9991yr abstractC9991yr) {
            return C2138Rl0.w(C1308Jr.h0(com.daaw.avee.a.k(), abstractC9991yr.I(), abstractC9991yr.J()), null);
        }

        public a() {
        }
    }

    public C1308Jr(Context context, String str, String str2, int i, int i2) {
        super(context, new a(), str, str2, i, i2, false);
    }

    public static List h0(Context context, int i, InterfaceC5694jX interfaceC5694jX) {
        Cursor cursorE;
        int iK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.H);
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String[] strArr = {"_id", "_data"};
        String strC = AbstractC2022Qi0.c((NU0.h) AbstractC9991yr.s.a(Integer.valueOf(i), interfaceC5694jX, null), 4);
        while (true) {
            cursorE = AbstractC2022Qi0.e(contentResolver, uri, strArr, "date_added>" + ((System.currentTimeMillis() / 1000) - ((long) (604800 * iK))), null, strC);
            iK++;
            if (iK > 8 || (cursorE != null && cursorE.getCount() > 0)) {
                break;
            }
        }
        if (cursorE == null) {
            return new ArrayList();
        }
        List listE = AbstractC1454Lb1.e(cursorE);
        cursorE.close();
        return listE;
    }
}
