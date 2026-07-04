package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10018yx implements ZV {
    @Override // com.daaw.ZV
    public Pair a(InterfaceC8715uJ interfaceC8715uJ, Uri uri, Format format, List list, DrmInitData drmInitData, R31 r31) {
        int i;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        boolean z = false;
        if ("text/vtt".equals(format.G) || lastPathSegment.endsWith(".webvtt") || lastPathSegment.endsWith(".vtt")) {
            interfaceC8715uJ = new C1889Pg1(format.Z, r31);
        } else {
            if (lastPathSegment.endsWith(".aac")) {
                interfaceC8715uJ = new C7529q3();
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                interfaceC8715uJ = new C4151e1();
            } else if (lastPathSegment.endsWith(".mp3")) {
                interfaceC8715uJ = new C0765El0(0, 0L);
            } else if (interfaceC8715uJ == null) {
                if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5)) {
                    if (list == null) {
                        list = Collections.EMPTY_LIST;
                    }
                    interfaceC8715uJ = new C6791nQ(0, r31, null, drmInitData, list);
                } else {
                    if (list != null) {
                        i = 48;
                    } else {
                        list = Collections.EMPTY_LIST;
                        i = 16;
                    }
                    String str = format.D;
                    if (!TextUtils.isEmpty(str)) {
                        if (!"audio/mp4a-latm".equals(AbstractC8834uk0.a(str))) {
                            i |= 2;
                        }
                        if (!"video/avc".equals(AbstractC8834uk0.j(str))) {
                            i |= 4;
                        }
                    }
                    interfaceC8715uJ = new C7824r61(2, r31, new C6389ly(i, list));
                }
            }
            z = true;
        }
        return Pair.create(interfaceC8715uJ, Boolean.valueOf(z));
    }
}
