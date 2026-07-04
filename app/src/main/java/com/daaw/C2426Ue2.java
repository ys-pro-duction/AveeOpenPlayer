package com.daaw;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Ue2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2426Ue2 implements InterfaceC4790gG1 {
    public final /* synthetic */ InterfaceViewOnClickListenerC9097vf2 a;
    public final /* synthetic */ ViewGroup b;

    public C2426Ue2(InterfaceViewOnClickListenerC9097vf2 interfaceViewOnClickListenerC9097vf2, ViewGroup viewGroup) {
        this.a = interfaceViewOnClickListenerC9097vf2;
        this.b = viewGroup;
    }

    @Override // com.daaw.InterfaceC4790gG1
    public final void a(MotionEvent motionEvent) {
        this.a.onTouch(null, motionEvent);
    }

    @Override // com.daaw.InterfaceC4790gG1
    public final JSONObject zza() {
        return this.a.zzo();
    }

    @Override // com.daaw.InterfaceC4790gG1
    public final JSONObject zzb() {
        return this.a.zzp();
    }

    @Override // com.daaw.InterfaceC4790gG1
    public final void zzc() {
        OP2 op2 = ViewTreeObserverOnGlobalLayoutListenerC2112Re2.P;
        Map mapZzm = this.a.zzm();
        if (mapZzm == null) {
            return;
        }
        int size = op2.size();
        int i = 0;
        while (i < size) {
            Object obj = mapZzm.get((String) op2.get(i));
            i++;
            if (obj != null) {
                this.a.onClick(this.b);
                return;
            }
        }
    }
}
