package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.daaw.gZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4865gZ0 implements InterfaceC6819nX {
    public volatile boolean a = false;
    public final Map b = new ConcurrentHashMap();
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();

    @Override // com.daaw.InterfaceC6819nX
    public synchronized InterfaceC2420Ud0 a(String str) {
        C4586fZ0 c4586fZ0;
        c4586fZ0 = (C4586fZ0) this.b.get(str);
        if (c4586fZ0 == null) {
            c4586fZ0 = new C4586fZ0(str, this.c, this.a);
            this.b.put(str, c4586fZ0);
        }
        return c4586fZ0;
    }

    public void b() {
        this.b.clear();
        this.c.clear();
    }

    public LinkedBlockingQueue c() {
        return this.c;
    }

    public List d() {
        return new ArrayList(this.b.values());
    }

    public void e() {
        this.a = true;
    }
}
