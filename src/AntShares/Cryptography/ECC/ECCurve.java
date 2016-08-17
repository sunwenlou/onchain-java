package AntShares.Cryptography.ECC;

import java.math.BigInteger;

/**
 *  ECC椭圆曲线参数
 */
public class ECCurve
{
    final BigInteger Q;
    final ECFieldElement A;
    final ECFieldElement B;
    final BigInteger N;
    /**
     *  无穷远点
     */
    public final ECPoint Infinity;
    /**
     *  基点
     */
    public final ECPoint G;

    private ECCurve(BigInteger Q, BigInteger A, BigInteger B, BigInteger N, byte[] G)
    {
        this.Q = Q;
        this.A = new ECFieldElement(A, this);
        this.B = new ECFieldElement(B, this);
        this.N = N;
        this.Infinity = new ECPoint(null, null, this);
        this.G = ECPoint.DecodePoint(G, this);
    }

    /**
     *  曲线secp256k1
     */
    public static final ECCurve Secp256k1 = new ECCurve
    (
        // TODO
        BigInteger.ONE,
        BigInteger.ONE,
        BigInteger.ONE,
        BigInteger.ONE,
        null
//        BigInteger.Parse("00FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F", NumberStyles.AllowHexSpecifier),
//        BigInteger.Zero,
//        7,
//        BigInteger.Parse("00FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141", NumberStyles.AllowHexSpecifier),
//        ("04" + "79BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798" + "483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8").HexToBytes()
    );

    /**
     *  曲线secp256r1
     */
    public static final ECCurve Secp256r1 = new ECCurve
    (
        // TODO
        BigInteger.ONE,
        BigInteger.ONE,
        BigInteger.ONE,
        BigInteger.ONE,
        null
//        BigInteger.Parse("00FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF", NumberStyles.AllowHexSpecifier),
//        BigInteger.Parse("00FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC", NumberStyles.AllowHexSpecifier),
//        BigInteger.Parse("005AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B", NumberStyles.AllowHexSpecifier),
//        BigInteger.Parse("00FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551", NumberStyles.AllowHexSpecifier),
//        ("04" + "6B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C296" + "4FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5").HexToBytes()
    );
}