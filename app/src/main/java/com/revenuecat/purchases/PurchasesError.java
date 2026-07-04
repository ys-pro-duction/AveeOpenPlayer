package com.revenuecat.purchases;

import com.daaw.AbstractC2911Yw;
import com.daaw.G10;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "", "code", "Lcom/revenuecat/purchases/PurchasesErrorCode;", "underlyingErrorMessage", "", "(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V", "getCode", "()Lcom/revenuecat/purchases/PurchasesErrorCode;", "message", "getMessage", "()Ljava/lang/String;", "getUnderlyingErrorMessage", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PurchasesError {
    private final PurchasesErrorCode code;
    private final String message;
    private final String underlyingErrorMessage;

    public PurchasesError(PurchasesErrorCode purchasesErrorCode, String str) {
        G10.g(purchasesErrorCode, "code");
        this.code = purchasesErrorCode;
        this.underlyingErrorMessage = str;
        this.message = purchasesErrorCode.getDescription();
    }

    public final PurchasesErrorCode getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getUnderlyingErrorMessage() {
        return this.underlyingErrorMessage;
    }

    public String toString() {
        return "PurchasesError(code=" + this.code + ", underlyingErrorMessage=" + this.underlyingErrorMessage + ", message='" + this.message + "')";
    }

    public /* synthetic */ PurchasesError(PurchasesErrorCode purchasesErrorCode, String str, int i, AbstractC2911Yw abstractC2911Yw) {
        this(purchasesErrorCode, (i & 2) != 0 ? null : str);
    }
}
