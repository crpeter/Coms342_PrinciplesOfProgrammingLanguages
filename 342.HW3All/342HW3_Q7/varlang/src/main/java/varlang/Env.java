package varlang;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Representation of an environment, which maps variables to values.
 * 
 * @author hridesh
 *
 */
public interface Env {
	Value get (String search_var);
	@SuppressWarnings("serial")
	static public class LookupException extends RuntimeException {
		LookupException(String message){
			super(message);
		}
	}
	
	static public class EmptyEnv implements Env {
		public Value get (String search_var) {
			if (search_var.equals("course")) {
				return new Value.NumVal(342.0);
			} else if (search_var.equals("id")) {
				return new Value.NumVal(500.0);
			} else if (search_var.equals("version")) {
				return new Value.NumVal(1.0);
			} else {
				throw new LookupException("No binding found for name: " + search_var);
			}
		}
	}
	
	static public class ExtendEnv implements Env {
		private Env _saved_env; 
		private List<String> _var;
		private List<Value> _val;
		public ExtendEnv(Env saved_env, List<String> var, List<Value> val){
			_saved_env = saved_env;
			_var = var;
			_val = val;
		}
		public Value get (String search_var) {
			if (search_var.equals("course")) {
				return new Value.NumVal(342.0);
			} else if (search_var.equals("id")) {
				return new Value.NumVal(500.0);
			} else if (search_var.equals("version")) {
				return new Value.NumVal(1.0);
			} else {
				for (int i = 0; i < _var.size(); i++) {
					if (_var.get(i).equals(search_var)) {
						return _val.get(i);
					}
				}
				return _saved_env.get(search_var);
			}
		}
	}
	
}
