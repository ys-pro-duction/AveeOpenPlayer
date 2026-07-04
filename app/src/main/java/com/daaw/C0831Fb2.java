package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.daaw.Fb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0831Fb2 extends AbstractC9351wa2 implements InterfaceC9191vz1 {
    public final Map C;
    public final Context D;
    public final C4498fF2 E;

    public C0831Fb2(Context context, Set set, C4498fF2 c4498fF2) {
        super(set);
        this.C = new WeakHashMap(1);
        this.D = context;
        this.E = c4498fF2;
    }

    public final synchronized void B0(View view) {
        try {
            ViewOnAttachStateChangeListenerC9470wz1 viewOnAttachStateChangeListenerC9470wz1 = (ViewOnAttachStateChangeListenerC9470wz1) this.C.get(view);
            if (viewOnAttachStateChangeListenerC9470wz1 == null) {
                ViewOnAttachStateChangeListenerC9470wz1 viewOnAttachStateChangeListenerC9470wz12 = new ViewOnAttachStateChangeListenerC9470wz1(this.D, view);
                viewOnAttachStateChangeListenerC9470wz12.c(this);
                this.C.put(view, viewOnAttachStateChangeListenerC9470wz12);
                viewOnAttachStateChangeListenerC9470wz1 = viewOnAttachStateChangeListenerC9470wz12;
            }
            if (this.E.Z) {
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.m1)).booleanValue()) {
                    viewOnAttachStateChangeListenerC9470wz1.g(((Long) zzba.zzc().b(AbstractC9820yE1.l1)).longValue());
                    return;
                }
            }
            viewOnAttachStateChangeListenerC9470wz1.f();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void C0(View view) {
        if (this.C.containsKey(view)) {
            ((ViewOnAttachStateChangeListenerC9470wz1) this.C.get(view)).e(this);
            this.C.remove(view);
        }
    }

    @Override // com.daaw.InterfaceC9191vz1
    public final synchronized void b0(final C8912uz1 c8912uz1) {
        A0(new InterfaceC9072va2() { // from class: com.daaw.Eb2
            @Override // com.daaw.InterfaceC9072va2
            public final void zza(Object obj) {
                ((InterfaceC9191vz1) obj).b0(c8912uz1);
            }
        });
    }
}
