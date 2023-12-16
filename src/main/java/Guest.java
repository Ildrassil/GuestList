import lombok.Data;
import lombok.Value;

@Value
public record Guest(
        String id,
        String name
) {
}