package com.revenuecat.purchases.common;

import com.daaw.C10032z00;
import com.daaw.G10;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Int$Companion;", "", "byteArray", "", "fromLittleEndianBytes", "(Lcom/daaw/z00;[B)I", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class IntExtensionsKt {
    public static final int fromLittleEndianBytes(C10032z00 c10032z00, byte[] bArr) {
        G10.g(c10032z00, "<this>");
        G10.g(bArr, "byteArray");
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }
}
