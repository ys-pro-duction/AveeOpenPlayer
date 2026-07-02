package com.daaw;

/* JADX INFO: renamed from: com.daaw.rk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7997rk0 implements SV0 {
    public final int a;
    public final SV0[] b;
    public final C8276sk0 c;

    public C7997rk0(int i, SV0... sv0Arr) {
        this.a = i;
        this.b = sv0Arr;
        this.c = new C8276sk0(i);
    }

    @Override // com.daaw.SV0
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (SV0 sv0 : this.b) {
            if (stackTraceElementArrA.length <= this.a) {
                break;
            }
            stackTraceElementArrA = sv0.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.a ? this.c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
