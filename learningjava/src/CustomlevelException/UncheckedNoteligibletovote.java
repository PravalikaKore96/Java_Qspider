package CustomlevelException;
//custom level unchecked Exceptions
public class UncheckedNoteligibletovote extends RuntimeException {
public String getMessage()
{
	return"not eligibleto vote";
}
}
