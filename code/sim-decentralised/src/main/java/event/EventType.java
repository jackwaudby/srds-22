package event;

public enum EventType {
    NODE_EPOCH_TIMEOUT,
    TRANSACTION_COMPLETED,
    PREPARE_RECEIVED,
    PREPARE_ACK_RECEIVED,
    COMMIT_RECEIVED
}