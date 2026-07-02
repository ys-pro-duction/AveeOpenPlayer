package com.daaw;

import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class H5 implements InterfaceC3217ag0 {
    @Override // com.daaw.InterfaceC3217ag0
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // com.daaw.InterfaceC3217ag0
    public AbstractC2948Zf0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C10161zU(BU.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // com.daaw.InterfaceC3217ag0
    public int c() {
        return 1073741823;
    }
}
