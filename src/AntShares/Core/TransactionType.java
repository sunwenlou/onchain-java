package AntShares.Core;

/**
 *  交易类型
 */
public enum TransactionType
{
    /**
     *  用于分配字节费的特殊交易
     */
    MinerTransaction(0x00),
    /**
     *  用于分发资产的特殊交易
     */
    IssueTransaction(0x01),
    /**
     *  用于分配小蚁币的特殊交易
     */
    ClaimTransaction(0x02),
    /**
     *  用于报名成为记账候选人的特殊交易
     */
    EnrollmentTransaction(0x20),
    /**
     *  用于投票选出记账人的特殊交易
     */
    VotingTransaction(0x24),
    /**
     *  用于资产登记的特殊交易
     */
    RegisterTransaction(0x40),
    /**
     *  合约交易，这是最常用的一种交易
     */
    ContractTransaction(0x80),
    /**
     *  委托交易
     */
    AgencyTransaction(0xb0),
    ;

    private byte value;

    TransactionType(int v)
    {
        value = (byte)v;
    }

    public byte getByte()
    {
        return value;
    }

}
