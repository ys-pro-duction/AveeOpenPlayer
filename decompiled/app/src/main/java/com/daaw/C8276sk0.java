package com.daaw;

/* JADX INFO: renamed from: com.daaw.sk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8276sk0 implements SV0 {
    public final int a;

    public C8276sk0(int i) {
        this.a = i;
    }

    @Override // com.daaw.SV0
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
