package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.daaw.Tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2307Tb {
    public final Context a;
    public final c b;
    public final BroadcastReceiver c;
    public C2201Sb d;

    /* JADX INFO: renamed from: com.daaw.Tb$b */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C2201Sb c2201SbB = C2201Sb.b(intent);
            if (c2201SbB.equals(C2307Tb.this.d)) {
                return;
            }
            C2307Tb c2307Tb = C2307Tb.this;
            c2307Tb.d = c2201SbB;
            c2307Tb.b.a(c2201SbB);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Tb$c */
    public interface c {
        void a(C2201Sb c2201Sb);
    }

    public C2307Tb(Context context, c cVar) {
        this.a = (Context) AbstractC7115ob.e(context);
        this.b = (c) AbstractC7115ob.e(cVar);
        this.c = AbstractC6280lb1.a >= 21 ? new b() : null;
    }
}
