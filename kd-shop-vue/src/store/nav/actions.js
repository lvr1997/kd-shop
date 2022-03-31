import * as types from './mutations_type'
export default {
  showAction({ commit, state }, param) {
    commit(types.SHOW, param)
  }
}
