package com.daaw;

import android.content.Context;
import com.daaw.C0642Dg1;
import com.daaw.avee.comp.playback.MediaPlaybackService;

/* JADX INFO: renamed from: com.daaw.iX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5415iX0 extends DB {
    public C5415iX0() {
        MediaPlaybackService.s0.b(new a(), this.a);
    }

    public boolean a(C2078Qw0 c2078Qw0) {
        if (c2078Qw0 == null || !c2078Qw0.p() || SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.K) == 1) {
            return false;
        }
        Context contextI = com.daaw.avee.a.i();
        if (contextI != null) {
            AbstractC5075hI.a.a(contextI.getResources().getString(JD0.t6, contextI.getResources().getString(JD0.a4)));
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().c0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.K, 1);
        return true;
    }

    /* JADX INFO: renamed from: com.daaw.iX0$a */
    public class a implements C0642Dg1.a {
        public a() {
        }

        @Override // com.daaw.C0642Dg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(Boolean bool, Boolean bool2, Integer num, String str, C2078Qw0 c2078Qw0) {
        }
    }
}
