import * as types from './mutations_type'
export default {
  [types.SHOW](state, params) {
    state.show = params
  }
}
